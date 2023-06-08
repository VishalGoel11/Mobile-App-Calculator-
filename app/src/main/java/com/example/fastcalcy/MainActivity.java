package com.example.fastcalcy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView txt1=findViewById(R.id.textView3);
        TextView txt2=findViewById(R.id.textView2);
        Button btnC=findViewById(R.id.button);
        Button btn1=findViewById(R.id.button11);
        Button btn2=findViewById(R.id.button14);
        Button btn3=findViewById(R.id.button9);
        Button btn4=findViewById(R.id.button13);
        Button btn5=findViewById(R.id.button10);
        Button btn6=findViewById(R.id.button15);
        Button btn7=findViewById(R.id.button7);
        Button btn8=findViewById(R.id.button4);
        Button btn9=findViewById(R.id.button8);
        Button btn0=findViewById(R.id.button18);
        Button btnCross=findViewById(R.id.button17);
        Button btnDiv=findViewById(R.id.button5);
        Button btnMul=findViewById(R.id.button6);
        Button btnAdd=findViewById(R.id.button16);
        Button btnSub=findViewById(R.id.button12);
        Button result=findViewById(R.id.button20);
        CustomClickListener click=new CustomClickListener(txt1,txt2,this);
        btn1.setOnClickListener(click);
        btn2.setOnClickListener(click);
        btn3.setOnClickListener(click);
        btn4.setOnClickListener(click);
        btn5.setOnClickListener(click);
        btn6.setOnClickListener(click);
        btn7.setOnClickListener(click);
        btn8.setOnClickListener(click);
        btn9.setOnClickListener(click);
        btn0.setOnClickListener(click);
        btnAdd.setOnClickListener(click);
        btnSub.setOnClickListener(click);
        btnDiv.setOnClickListener(click);
        btnMul.setOnClickListener(click);
        btnCross.setOnClickListener(click);
        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt1.setText("");
                txt2.setText("");
            }
        });
        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    EvaluateString eval = new EvaluateString(MainActivity.this);
//                    Toast.makeText(MainActivity.this,"vishu",Toast.LENGTH_LONG).show();
                    String exp = txt1.getText().toString()+" ";
//                    Toast.makeText(MainActivity.this,exp+" ",Toast.LENGTH_LONG).show();
                    double ans=eval.evaluate(exp);
                    txt2.setText(ans+"");
                    if(txt2.getText().toString().equals("Infinity")){
                        txt2.setText("");
                    }
                }catch (Exception e){
                    Toast.makeText(MainActivity.this,"Invalid format or no expression to evaluate",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}