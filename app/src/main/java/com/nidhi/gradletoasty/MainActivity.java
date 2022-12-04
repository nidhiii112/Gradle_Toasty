package com.nidhi.gradletoasty;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void showtoast (View view){
        switch (view.getId()){
            case R.id.errorbutton:
                Toasty.error(MainActivity.this, "This is error.", Toast.LENGTH_SHORT, true).show();
                break;

            case R.id.successbutton:
                Toasty.success(MainActivity.this, "Successfull", Toast.LENGTH_SHORT, true).show();
                break;

            case R.id.infobutton:
                Toasty.info(MainActivity.this, "This is the information that today is thursday.", Toast.LENGTH_SHORT, true).show();
                break;

            case R.id.warningbutton:
                Toasty.warning(MainActivity.this, "This is the warning..(Beware of dogs)", Toast.LENGTH_SHORT, true).show();
                break;

            case R.id.imagebutton:
                Toasty.normal(MainActivity.this, "image.", Toast.LENGTH_SHORT,
                ContextCompat.getDrawable(MainActivity.this,R.drawable.image))
                        .show();
                break;



        }









}
}