package com.example.primeiroapp.view.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.example.primeiroapp.MeuApp;
import com.example.primeiroapp.R;
import com.example.primeiroapp.listeners.OnUsuarioClickListener;
import com.example.primeiroapp.view.adapters.UsuarioAdapter;
import com.example.primeiroapp.model.Usuario;
import com.example.primeiroapp.viewmodel.UsuarioViewModel;

import java.util.List;

public class ListaActivity extends AppCompatActivity implements OnUsuarioClickListener {
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

        UsuarioAdapter adapter = new UsuarioAdapter(lista,this);
        recyclerViewUsuarios.setAdapter(adapter);
    }
    @Override
    public void onUsuarioClick(Usuario usuario) {
        Log.d("UsuarioClick", "Nome: " + usuario.getNome() + ", Idade: " + usuario.getIdade());
    }
}