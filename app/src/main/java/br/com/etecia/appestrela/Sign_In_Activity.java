package br.com.etecia.appestrela;


import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sign_In_Activity extends AppCompatActivity {

    Toolbar toolbarao;
    Button botao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signin_layout);

        toolbarao = findViewById(R.id.idToolBar);
        setSupportActionBar(toolbarao);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        /*getSupportActionBar().setIcon(R.drawable.ic_keyboard);
         *
         * Para colocar um ícone do lado do texto na Barra superior*/

        botao = findViewById(R.id.btnlogin);
        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),LoginActivity.class));
            }
        });
    }
}