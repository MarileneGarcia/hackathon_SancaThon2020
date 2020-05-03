package com.example.mesacerta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;
public class Faq extends AppCompatActivity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faq);
        listView= (ListView)findViewById(R.id.frequentQ);
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Como faço login?");
        arrayList.add("Como cadastrar meu cartão?");
        arrayList.add("Cuidados com a higiene para frequentar um estabelecimento em tempos de Covid");
        arrayList.add("Não recebi a confirmação de pagamento");
        arrayList.add("Como saber se registraram a minha mesa?");
        arrayList.add("Recebi uma cobrança indevida");
        arrayList.add("Como funciona o termômetro digital");
        arrayList.add("Meu cartão não está sendo aceito");
        arrayList.add("Como dividir a conta?");
        arrayList.add("Onde estão meus dado de usuário?");
        arrayList.add("É possível dar uma gorjeta virtual ao garçom?");
        arrayList.add("Quanto são os juros do serviço?");

        ArrayAdapter arrayAdapter= new ArrayAdapter(this,android.R.layout.simple_list_item_1, arrayList);
        listView.setAdapter(arrayAdapter);


    }
}
