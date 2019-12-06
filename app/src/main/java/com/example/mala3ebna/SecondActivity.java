package com.example.mala3ebna;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    TextView name;
    GoogleSignInClient mGoogleSignInClient;
    String[] print={"Zoser \n New Cairo\n", "Nile \n Manial\n", "Narmar \n Zamalek\n"};

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_pitches);

        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestEmail()
                .build();

        mGoogleSignInClient = GoogleSignIn.getClient(this, gso);
        name=findViewById(R.id.textView);

        GoogleSignInAccount acct = GoogleSignIn.getLastSignedInAccount(this);
        if (acct != null) {
            String personName = acct.getDisplayName();
            name.setText("Welcome "+ personName);
        }
//        final RequestQueue queue = Volley.newRequestQueue(this);
//        String url ="";
//// Request a string response from the provided URL.
//        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
//                new Response.Listener<String>() {
//                    @Override
//                    public void onResponse(String response) {
//                        try {
//                            JSONObject jsonResult = new JSONObject(response);
//                            JSONArray data = jsonResult.getJSONArray("data");
//                            if(data != null) {
//                                for(int i = 0 ; i < data.length() ; i++) {
//
//                                    print.add(data.getJSONObject(i).getString("datetime")+" "+ data.getJSONObject(i).getString("temp"));
//                                }
//                            }
//                        }
//                        catch(Exception e) {}
//                    }
//                }, new Response.ErrorListener() {
//            @Override
//            public void onErrorResponse(VolleyError error) {
//
//            }
//        });
//        queue.add(stringRequest);
        ListView listView = findViewById(R.id.listView);
        ArrayAdapter aa = new ArrayAdapter(getApplicationContext(),R.layout.listelement,print);
        listView.setAdapter(aa);

    }

}
