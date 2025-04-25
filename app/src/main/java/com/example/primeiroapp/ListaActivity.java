package com.example.primeiroapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ListaActivity extends AppCompatActivity {
    private ListView listViewUsuarios;
    private UsuarioViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);

        listViewUsuarios = findViewById(R.id.listViewUsuarios);
        viewModel = ((MeuApp) getApplication()).getUsuarioViewModel();

        List<Usuario> lista = viewModel.getUsuarios();

        // Cria uma lista de strings para exibir na ListView
        List<String> nomesUsuarios = new ArrayList<>();
        for (Usuario u : lista) {
            nomesUsuarios.add("Nome: " + u.getNome() + " - Idade: " + u.getIdade());
        }

        // Cria o ArrayAdapter e o associa à ListView
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, nomesUsuarios);
        listViewUsuarios.setAdapter(adapter);
    }
}