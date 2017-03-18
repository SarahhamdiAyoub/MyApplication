package com.example.lenovo.myapplication.DataProcess;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONException;
import java.util.ArrayList;

import static android.content.ContentValues.TAG;
import static com.example.lenovo.myapplication.DataProcess.KeyTags.descKey;
import static com.example.lenovo.myapplication.DataProcess.KeyTags.idKey;
import static com.example.lenovo.myapplication.DataProcess.KeyTags.imgKey;
import static com.example.lenovo.myapplication.DataProcess.KeyTags.priceKey;

/**
 * Created by Lenovo on 3/16/2017.
 */

public class JsonParser {
        ArrayList<DataEncap> data;

public ArrayList<DataEncap> JsonProcess(String jsonFile) {

        data = new ArrayList<>();

        try {


        JSONArray jsonArray = new JSONArray(jsonFile);

        for (int i = 0; i < jsonArray.length(); i++) {




                DataEncap GetDataAdapter2 = new DataEncap();

                JSONObject json = null;
                try {
                        json = jsonArray.getJSONObject(i);

                      //  GetDataAdapter2.setId(json.getInt());

                        GetDataAdapter2.setProductDescription(json.getString(descKey));

                        GetDataAdapter2.setPrice(json.getInt(priceKey) );
                        JSONObject im = json.getJSONObject(imgKey);
                        String url = im.getString("url");
                        GetDataAdapter2.setImage(url);
                        Integer width = im.getInt("width");
                        GetDataAdapter2.setWidth(width);
                        Integer height = im.getInt("height");
                        GetDataAdapter2.setHeight(height);

                } catch (JSONException e) {

                        e.printStackTrace();
                }

                        data.add(GetDataAdapter2);


        }

        } catch (JSONException e) {
        e.printStackTrace();
        }
        return data;
        }

public ArrayList<DataEncap> getlist() {
        return data;
        }

        }
