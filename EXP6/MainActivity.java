package com.example.myapplication4mt19cs104pgm6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import java.io.IOException;
import java.io.InputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

public class MainActivity extends AppCompatActivity {
    TextView xml_contents;
    TextView json_contents;
    Button parse_xml,parse_json;
    String cname,temp,lat,lon,humi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        xml_contents=(TextView) findViewById(R.id.xmlcontents);
        json_contents=(TextView) findViewById(R.id.json_contents);
        parse_json=(Button) findViewById(R.id.bt2);
        parse_xml=(Button) findViewById(R.id.bt1);
        parse_xml.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    InputStream is=getAssets().open("city.xml");
                    DocumentBuilderFactory dbFactory=DocumentBuilderFactory.newInstance();
                    DocumentBuilder dBuilder=dbFactory.newDocumentBuilder();
                    Document doc=dBuilder.parse(is);
                    NodeList nList=doc.getElementsByTagName("cities");
                    System.out.println(nList.item(0).getNodeName());
                    for(int i=0;i<nList.getLength();i++){
                        Element element2=(Element) nList.item(i);
                        cname=element2.getElementsByTagName("City_name").item(0).getFirstChild().getNodeValue();
                        lat=element2.getElementsByTagName("Latitude").item(0).getFirstChild().getNodeValue();
                        lon=element2.getElementsByTagName("Longitude").item(0).getFirstChild().getNodeValue();
                        temp=element2.getElementsByTagName("Temperature").item(0).getFirstChild().getNodeValue();
                        humi=element2.getElementsByTagName("Humidity").item(0).getFirstChild().getNodeValue();
                        xml_contents.setText(xml_contents.getText()+"City_name: "+cname+"\nLatitude: "+lat+"\nLongitude: "+lon+"\nTemperature: "+temp+"\nHumidity: "+humi);
                    }
                }catch (IOException | ParserConfigurationException | SAXException e){
                    e.printStackTrace();
                }
            }
        });
        parse_json.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {try {
                InputStream is1=getAssets().open("test.json");
                byte[] buffer=new byte[is1.available()];
                is1.read(buffer);
                String jsonstring=new String(buffer);
                JSONObject reader=new JSONObject(jsonstring);
                JSONObject user1=reader.getJSONObject("User1");
                String name=user1.getString("City_name");
                String lat=user1.getString("Latitude");
                String lon=user1.getString("Longitude");
                String temp=user1.getString("Temperature");
                String hum=user1.getString("Humidity");
                json_contents.setText(json_contents.getText()+"City_name: "+name+"\nLatitude: "+lat+"\nLongitude: "+lon+"\nTemperature: "+temp+"\nHumidity: "+hum);

            }catch(JSONException | IOException e){
                e.printStackTrace();
            }
            }
        });
    }
}