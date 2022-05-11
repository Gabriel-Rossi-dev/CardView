package com.cursoandroid.teste.cardview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.cursoandroid.teste.cardview.R;
import com.cursoandroid.teste.cardview.adapter.PostAdapter;
import com.cursoandroid.teste.cardview.model.Post;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Post> post = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        //layout
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        //adapter
        this.preparePost();

        PostAdapter adapter = new PostAdapter(post);
        recyclerView.setAdapter(adapter);
    }

    public void preparePost (){

        Post p = new Post("Gabriel Rossi" , "#tbt Viagem Legal!", R.drawable.imagem1);
        this.post.add(p);

        p = new Post("Hotel GR", "Ótima viagem", R.drawable.imagem2);
        this.post.add(p);

        p = new Post("Maria Luiza", "#Paris", R.drawable.imagem3);
        this.post.add(p);

        p = new Post("Marcos", "#35mm", R.drawable.imagem4);
        this.post.add(p);


    }

}
