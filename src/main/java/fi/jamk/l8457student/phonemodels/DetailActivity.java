package fi.jamk.l8457student.phonemodels;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import fi.jamk.l8457student.phonemodels.R;

public class DetailActivity extends Activity {

    /*
    *
    *This is the DetailActivity class that controls the info screen when you press the button
    *
    *
     */


        @Override
        protected void onCreate (Bundle savedInstanceState){
            super.onCreate(savedInstanceState);

            // draw activity detail layout
            setContentView(R.layout.activity_detail);

            // get intent which has used to open this activity
            Intent intent = getIntent();

            // get data from intent
            Bundle bundle = intent.getExtras();

            // get phone name
            String phone = bundle.getString("phone");

            // update text and image views to show data
            TextView textView = (TextView) findViewById(R.id.phoneTextView);
            textView.setText(phone);
            ImageView imageView = (ImageView) findViewById(R.id.phoneImageView);



            // show phone image. images should be saved to drawable folder


            switch (phone) {
                case "Android":
                    imageView.setImageResource(R.drawable.android);
                    break;
                case "iPhone":
                    imageView.setImageResource(R.drawable.ios);
                    break;
                case "WindowsMobile":
                    imageView.setImageResource(R.drawable.windows);
                    break;
                case "Blackberry":
                    imageView.setImageResource(R.drawable.blackberry);
                    break;
                case "WebOS":
                    imageView.setImageResource(R.drawable.webos);
                    break;
                case "Ubuntu":
                    imageView.setImageResource(R.drawable.ubuntu);
                    break;
            }

        }
    public void backButtonPressed(View view) {
        // finish and close activity
        finish();
    }

    }
