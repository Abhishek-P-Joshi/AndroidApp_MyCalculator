package com.example.abhishek.mycalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText Operand1;
    private EditText Operand2;
    private Button btnAddition;
    private Button btnSubtraction;
    private Button btnMultiplication;
    private Button btnDivision;
    private TextView txt_result;
    private Button btnReset;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Operand1=(EditText) findViewById(R.id.edt_txtOperand1);
        Operand2=(EditText) findViewById(R.id.edt_txtOperand2);
        btnAddition=(Button) findViewById(R.id.btnaddition);
        btnSubtraction=(Button) findViewById(R.id.btnSubtraction);
        btnMultiplication=(Button) findViewById(R.id.btnMultiplication);
        btnDivision=(Button) findViewById(R.id.btnDivision);
        txt_result=(TextView) findViewById(R.id.txt_result);
        btnReset=(Button) findViewById(R.id.btnreset);

        btnAddition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(Operand1.getText().length()>0 && Operand2.getText().length()>0){
                    double Oper1 = Double.parseDouble(Operand1.getText().toString());
                    double Oper2 = Double.parseDouble(Operand2.getText().toString());

                    double theresult= Oper1 +Oper2;

                    txt_result.setText(Double.toString(theresult));
                }else{
                    Toast.makeText(MainActivity.this,"Please Enter Numbers in both Operand fields", Toast.LENGTH_LONG).show();
                }

                }
        });

        btnSubtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Operand1.getText().length()>0 && Operand2.getText().length()>0){
                    double Oper1 = Double.parseDouble(Operand1.getText().toString());
                    double Oper2 = Double.parseDouble(Operand2.getText().toString());

                    double theresult= Oper1 - Oper2;

                    txt_result.setText(Double.toString(theresult));
                }else{
                    Toast.makeText(MainActivity.this,"Please Enter Numbers in both Operand fields", Toast.LENGTH_LONG).show();
                }
            }
        });

        btnMultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Operand1.getText().length()>0 && Operand2.getText().length()>0){
                    double Oper1 = Double.parseDouble(Operand1.getText().toString());
                    double Oper2 = Double.parseDouble(Operand2.getText().toString());

                    double theresult= Oper1 * Oper2;

                    txt_result.setText(Double.toString(theresult));
                }else{
                    Toast.makeText(MainActivity.this,"Please Enter Numbers in both Operand fields", Toast.LENGTH_LONG).show();
                }
            }
        });

        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Operand1.getText().length()>0 && Operand2.getText().length()>0){
                    double Oper1 = Double.parseDouble(Operand1.getText().toString());
                    double Oper2 = Double.parseDouble(Operand2.getText().toString());

                    if(Oper2!=0){
                        double theresult= Oper1 / Oper2;
                        txt_result.setText(Double.toString(theresult));
                    }else{
                        Toast.makeText(MainActivity.this,"Divide by zero not Possible. Please Enter a non-zero Number.", Toast.LENGTH_LONG).show();
                        Operand2.requestFocus();
                    }

                }else{
                    Toast.makeText(MainActivity.this,"Please Enter Numbers in both Operand fields", Toast.LENGTH_LONG).show();
                }
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //double Oper1 = Double.parseDouble(Operand1.getText().toString());
                //double Oper2 = Double.parseDouble(Operand2.getText().toString());
                //double theresult= Oper1 / Oper2;
                //txt_result.setText(Double.toString(theresult));
               double result=0.00;
                Operand1.setText(null);
                Operand2.setText(null);
                txt_result.setText(Double.toString(result));
                Operand1.requestFocus();

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
