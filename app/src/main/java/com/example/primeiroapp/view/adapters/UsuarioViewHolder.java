package com.example.primeiroapp.view.adapters;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.primeiroapp.R;
import com.example.primeiroapp.listeners.OnUsuarioClickListener;
import com.example.primeiroapp.model.Usuario;

public class UsuarioViewHolder extends RecyclerView.ViewHolder {
    TextView textViewNome, textViewIdade;

    public UsuarioViewHolder(@NonNull View itemView) {
        super(itemView);
        textViewNome = itemView.findViewById(R.id.textViewNome);
        textViewIdade = itemView.findViewById(R.id.textViewIdade);
    }
    public void bind(final Usuario usuario, final OnUsuarioClickListener listener) {
        textViewNome.setText("Nome: " + usuario.getNome());
        textViewIdade.setText("Idade: " + usuario.getIdade());

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onUsuarioClick(usuario);
            }
        });
    }


}