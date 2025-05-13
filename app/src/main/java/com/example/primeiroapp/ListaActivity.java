package com.example.primeiroapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.primeiroapp.RecyclerViewGroup.UsuarioAdapter;

import java.util.List;

public class ListaActivity extends AppCompatActivity {
    private RecyclerView recyclerViewUsuarios;
    private UsuarioViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);

        recyclerViewUsuarios = findViewById(R.id.recyclerViewUsuarios);
        recyclerViewUsuarios.setLayoutManager(new LinearLayoutManager(this));

        viewModel = ((MeuApp) getApplication()).getUsuarioViewModel();
        List<Usuario> lista = viewModel.getUsuarios();

        UsuarioAdapter adapter = new UsuarioAdapter(lista);
        recyclerViewUsuarios.setAdapter(adapter);
    }
}