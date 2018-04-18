package app.holamundo.com.tarea3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText num1,num2;
    Button btnSum, btnRest, btnMulti, btnDiv, btnLimp;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText) findViewById(R.id.edtxt1);
        num2 = (EditText) findViewById(R.id.edtxt2);

        btnSum = (Button) findViewById(R.id.btnSumar);
        btnRest = (Button) findViewById(R.id.btnRestar);
        btnMulti = (Button) findViewById(R.id.btnMultiplicar);
        btnDiv = (Button) findViewById(R.id.btnDividir);
        btnLimp = (Button) findViewById(R.id.btnLimpiar);

        resultado = findViewById(R.id.txtxvResultado);


        btnSum.setOnClickListener(this);
        btnRest.setOnClickListener(this);
        btnMulti.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
        btnLimp.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        String n1 = num1.getText().toString();
        String n2 = num2.getText().toString();

        int entero1 = Integer.parseInt(n1);
        int entero2 = Integer.parseInt(n2);

        int rsl = 0;


        switch (view.getId()){
            case R.id.btnSumar:
                rsl=entero1+entero2;
                break;

            case R.id.btnRestar:
                rsl=entero1-entero2;
                break;

            case R.id.btnMultiplicar:
                rsl=entero1*entero2;
                break;

            case R.id.btnDividir:
                rsl=entero1/entero2;
                break;

            case R.id.btnLimpiar:
                entero1 = 0;
                entero2 = 0;
                resultado.setText("");
                break;

        }


        resultado.setText(""+rsl);

    }
}
