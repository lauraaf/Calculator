package edu.upc.dsa.calculator;

import androidx.appcompat.app.AppCompatActivity;
//import android.annotation.SuppressLint;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

//@SuppressLint("UseSwitchCompatOrMaterialCode")
public class MainActivity extends AppCompatActivity {

    Button btn_0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bAdd,bSub,bProd,bDiv,bSin,bCos,bTan,bEqual,bClear,bComa;
    @SuppressLint("UseSwitchCompatOrMaterialCode")
    Switch sw_RadGrad;
    TextView text;
    Operation operation;
    double num1;
    double num2;
    double res;
    boolean trig = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.displayNumber);
        btn_0 = findViewById(R.id.btn0);
        b1 = findViewById(R.id.btn1);
        b2 = findViewById(R.id.btn2);
        b3 = findViewById(R.id.btn3);
        b4 = findViewById(R.id.btn4);
        b5 = findViewById(R.id.btn5);
        b6 = findViewById(R.id.btn6);
        b7 = findViewById(R.id.btn7);
        b8 = findViewById(R.id.btn8);
        b9 = findViewById(R.id.btn9);
        bAdd = findViewById(R.id.btn_Add);
        bSub = findViewById(R.id.btn_Sub);
        bProd = findViewById(R.id.btn_PROD);
        bDiv= findViewById(R.id.btn_DIV);
        bSin = findViewById(R.id.btn_SIN);
        bCos = findViewById(R.id.btn_COS);
        bTan = findViewById(R.id.btn_TAN);
        bEqual = findViewById(R.id.btn_Equal);
        bClear = findViewById(R.id.btn_clear);
        bComa = findViewById(R.id.btn_coma);
        sw_RadGrad = findViewById(R.id.switchGradRad);
    }

    public void b0Click (android.view.View v){
        text.setText(text.getText()+"0");
    }
    public void b1Click (android.view.View v){
        text.setText(text.getText()+"1");
    }
    public void b2Click (android.view.View v){
        text.setText(text.getText()+"2");
    }
    public void b3Click (android.view.View v){
        text.setText(text.getText()+"3");
    }
    public void b4Click (android.view.View v){
        text.setText(text.getText()+"4");
    }
    public void b5Click (android.view.View v){
        text.setText(text.getText()+"5");
    }
    public void b6Click (android.view.View v){
        text.setText(text.getText()+"6");
    }
    public void b7Click (android.view.View v){
        text.setText(text.getText()+"7");
    }
    public void b8Click (android.view.View v){
        text.setText(text.getText()+"8");
    }
    public void b9Click (android.view.View v){
        text.setText(text.getText()+"9");
    }
    public void bComaClick (android.view.View v){
        text.setText(text.getText()+".");
    }
    public void bClearClick (android.view.View v){
        if(text.getText().length() > 0)
            text.setText("");
    }
    public void bAddClick (android.view.View v){
       operation = new Add();
       Add add = (Add) operation;
       num1 = Double.parseDouble(text.getText().toString());
       text.setText("");
    }
    public void bSubClick (android.view.View v){
        operation = new Substract();
        Substract sub = (Substract) operation;
        num1 = Double.parseDouble(text.getText().toString());
        text.setText("");
    }
    public void bDivClick (android.view.View v){
        operation = new Division();
        Division div = (Division) operation;
        num1 = Double.parseDouble(text.getText().toString());
        text.setText("");
    }
    public void bProdClick (android.view.View v){
        operation = new Product();
        Product prod = (Product) operation;
        num1 = Double.parseDouble(text.getText().toString());
        text.setText("");
    }
    public void bSinClick (android.view.View v){
        operation = new Sinus();
        Sinus sin = (Sinus) operation;
        trig = true;
    }
    public void bCosClick (android.view.View v){
        operation = new Cos();
        Cos cos = (Cos) operation;
        trig = true;
    }
    public void bTanClick (android.view.View v){
        operation = new Tangent();
        Tangent sub = (Tangent) operation;
        trig = true;
    }
    public void bEqualClick (android.view.View v){
        if (operation == null){
            return;
        }
        if (trig){
            num1 = Double.parseDouble(text.getText().toString());
            if(sw_RadGrad.isChecked()){
                num2 = 1; //grados
            }
            else{
                num2 = 0;//radianes
            }
            trig = false;
        }
        else{
            num2 = Double.parseDouble(text.getText().toString());
        }
        res = operation.operation(num1,num2);
        text.setText(String.valueOf(res));
    }
}