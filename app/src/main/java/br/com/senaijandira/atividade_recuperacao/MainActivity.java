package br.com.senaijandira.atividade_recuperacao;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CheckBox arroz;
    CheckBox leite;
    CheckBox contrafile;
    CheckBox coca;
    CheckBox feijao;
    TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arroz = findViewById(R.id.arroz);
        leite = findViewById(R.id.leite);
        contrafile = findViewById(R.id.contrafile);
        coca = findViewById(R.id.coca);
        feijao = findViewById(R.id.feijao);
        txtResultado = findViewById(R.id.txtResultado);
    }

    public void calcular(View view) {

        Double total = 0.0;

        //verificar se está selecionado

        if(arroz.isChecked()){
            total += 9;
        }

        if (leite.isChecked()) {
            total += 2.5;
        }

        if (contrafile.isChecked()){
            total+= 27.70;
        }

        if (coca.isChecked()){
            total += 8.65 ;
        }
        if (feijao.isChecked()){
            total += 7.50 ;
        }
        txtResultado.setText("Resultado:"+total);



        }


    }

