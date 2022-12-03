package br.com.pontes.jogodamemoria;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

public class SobreActivity extends AppCompatActivity {



    public void abrirTelaCartas(View view){
        Intent intent = new Intent(this, MainActivity.class);
        //onDestroy();
        finish();
        startActivity(intent);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //getSupportActionBar().hide();
        setContentView(R.layout.activity_sobre);
        setTitle("Sobre o APP");
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);


    }

  public void openBrowser(View v){
        String url = (String)v.getTag();
        Intent i = new Intent();
        i.setAction(Intent.ACTION_VIEW);
        i.addCategory(Intent.CATEGORY_BROWSABLE);
        i.setData(Uri.parse(url));
        startActivity(i);
  }
}