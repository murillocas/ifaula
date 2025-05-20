package com.example.primeiroapp.view.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.primeiroapp.MeuApp;
import com.example.primeiroapp.R;
import com.example.primeiroapp.model.Usuario;
import com.example.primeiroapp.viewmodel.UsuarioViewModel;

public class CadastroActivity extends AppCompatActivity {

    private EditText edtNome, edtIdade;
    private Button btnSalvar;
    private UsuarioViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        edtNome = findViewById(R.id.editNome);
        edtIdade = findViewById(R.id.editIdade);
        btnSalvar = findViewById(R.id.btnSalvar);

        // Pegando a instância do ViewModel a partir da aplicação
        viewModel = ((MeuApp) getApplication()).getUsuarioViewModel();

        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nome = edtNome.getText().toString();
                int idade = Integer.parseInt(edtIdade.getText().toString());

                Usuario novoUsuario = new Usuario(nome, idade);
                viewModel.adicionarUsuario(novoUsuario);
                finish(); // volta para a MainActivity
            }
        });

    }
}