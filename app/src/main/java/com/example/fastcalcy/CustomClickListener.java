package com.example.fastcalcy;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CustomClickListener extends AppCompatActivity implements OnClickListener{
    TextView textView1,textView2;
    AppCompatActivity app;
    CustomClickListener(TextView view1, TextView view2, AppCompatActivity cont){
         textView1=view1;
         textView2=view2;
         app=cont;
    }
    int a=0,b=0,c=0;
    @Override
    public void onClick(View v) {
        int d=1;
        int duration = Toast.LENGTH_SHORT;
        Button btn=(Button) v;
        String btnpressed=btn.getText().toString();
        if(a==0){
            a++;
            if(!btnpressed.equals("x"))
            textView1.setText(btnpressed);
        }else{

            if(btnpressed.equals("( )")){
                if(b==0) {
                    btnpressed = "(";
                    b=1;
                }
                else {
                    btnpressed = ")";
                    b=0;
                }
            }
            if(btnpressed.equals("x")){
                d=0;
                String text="";
                text=textView1.getText().toString();
                if(text.length()>0) {
                    textView1.setText(textView1.getText().toString().substring(0, textView1.getText().toString().length() - 1));
                }
            }
            if(d==1) {
                textView1.setText(textView1.getText().toString() + btnpressed);

            }
        }

    }
}
