package com.example.pc_1040.nuevo;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

EditText entrada1, entrada2;
Button btn_suma, btn_resta, btn_multiplicacion, btn_division;
TextView tv_respuesta;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        entrada1=findViewById(R.id.editText);
        entrada2=findViewById(R.id.editText2);
        btn_suma=findViewById(R.id.button2);
        btn_resta=findViewById(R.id.button3);
        btn_multiplicacion=findViewById(R.id.button4);
        btn_division=findViewById(R.id.button5);
        tv_respuesta=findViewById(R.id.textView2);

        btn_suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String t1= entrada1.getText().toString();
                String t2= entrada2.getText().toString();
                if(t1.equals("")||t2.equals(""))
                {
                    mensaje();
                }else {
                    int n1=Integer.parseInt(entrada1.getText().toString());
                    int n2=Integer.parseInt(entrada2.getText().toString());
                    int r=n1+n2;
                    tv_respuesta.setText(String.valueOf(r));
                }

            }

        });
        btn_resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String t1= entrada1.getText().toString();
                String t2= entrada2.getText().toString();
                if(t1.equals("")||t2.equals(""))
                {
                    mensaje();
                }
                else {
                    int n1 = Integer.parseInt(entrada1.getText().toString());
                    int n2 = Integer.parseInt(entrada2.getText().toString());
                    int r;
                    if (n1 > n2) {
                        r = n1 - n2;

                        tv_respuesta.setText(String.valueOf(r));
                    } else {
                        r = n2 - n1;
                        tv_respuesta.setText(String.valueOf(r));
                    }
                }
                }
        });

    }
    public void mensaje()
    {
        Context c = getApplicationContext();
        Toast.makeText(c,"Error de campos en blanco",Toast.LENGTH_LONG).show();
    }
}
