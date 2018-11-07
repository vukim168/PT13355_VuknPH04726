package com.pro1.vukn.englishforkids;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.pro1.vukn.englishforkids.adapter.VideoYoutubeAdapter;
import com.pro1.vukn.englishforkids.model.VideoYoutube;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class VideoActivity extends AppCompatActivity {
    public static String API_KEY = "AIzaSyAiBIn2RQccEOROUtL22R1CtAWl0dm9Vz8";
    String ID_PLAYLIST = "PLnynIfttXvbXMx8lEYER1nS0POX-DCzcu";
    String urlGetJson = "https://www.googleapis.com/youtube/v3/playlistItems?part=snippet&playlistId=PLnynIfttXvbXMx8lEYER1nS0POX-DCzcu&key=AIzaSyAiBIn2RQccEOROUtL22R1CtAWl0dm9Vz8&maxResults=50";
    ListView listView;
    ArrayList<VideoYoutube> arrVideo;
    VideoYoutubeAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        GetJsonYouTube(urlGetJson);
        listView = (ListView)findViewById(R.id.listview);
        arrVideo = new ArrayList<VideoYoutube>();
        adapter = new VideoYoutubeAdapter(this, R.layout.dong_video, arrVideo);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                Intent intent = new Intent(VideoActivity.this, PlayVideoActivity.class);

                intent.putExtra("idvideoYoutube", arrVideo.get(i).getIDVideo());
                startActivity(intent);
            }
        });
    }
    private void GetJsonYouTube(String url) {
        final RequestQueue requestQueue = Volley.newRequestQueue(this);
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try {
                    JSONArray jsonItems = response.getJSONArray("items");
                    String title = "";
                    String url = "";
                    String idVideo = "";
                    for (int i = 0; i < jsonItems.length(); i++) {
                        JSONObject jsonItem = jsonItems.getJSONObject(i);
                        JSONObject jsonSnippet = jsonItem.getJSONObject("snippet");
                        title = jsonSnippet.getString("title");
                        JSONObject jsonThumbnail = jsonSnippet.getJSONObject("thumbnails");
                        JSONObject jsonMedium = jsonThumbnail.getJSONObject("medium");
                        url = jsonMedium.getString("url");
                        JSONObject jsonResourceID = jsonSnippet.getJSONObject("resourceId");
                        idVideo = jsonResourceID.getString("videoId");
                        arrVideo.add(new VideoYoutube(title, url, idVideo));
                    }
                    adapter.notifyDataSetChanged();
                } catch (JSONException e) {
                    e.printStackTrace();
                }


            }
        },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(VideoActivity.this, "No Internet connection ", Toast.LENGTH_SHORT).show();
                    }
                }
        );
        requestQueue.add(jsonObjectRequest);
    }
}
