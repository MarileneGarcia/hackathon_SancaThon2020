package com.example.mesacerta;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Ocup extends AppCompatActivity {

    ListView listView;
    String mTitle[] = {"Central Perk", "The Cheesecake Factory", "Krusty Burguer", "MacLaren's pub", "The Three Broomsticks","Anteiku" };
    String mDescription[] = {"100% de ocupação", "74% de ocupação", "2% de ocupação", "76% de ocupação", "42% de ocupação", "15% de ocupação"};
    int images[] = {R.drawable.term_verm, R.drawable.term_amar, R.drawable.term_az, R.drawable.term_verm, R.drawable.term_amar, R.drawable.term_az};
    // so our images and other things are set in array

    // now paste some images in drawable

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ocup);

        listView = findViewById(R.id.listView);
        // now create an adapter class

        MyAdapter adapter = new MyAdapter(this, mTitle, mDescription, images);
        listView.setAdapter(adapter);
        // there is my mistake...
        // now again check this..

        // now set item click on list view
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position ==  0) {
                    Intent i = new Intent(Ocup.this, Pagamentos.class);
                    startActivity(i);
                }
                else if (position ==  1) {
                    Intent i = new Intent(Ocup.this, Pagamentos.class);
                    startActivity(i);
                }
                else if (position ==  2) {
                    Intent i = new Intent(Ocup.this, Pagamentos.class);
                    startActivity(i);
                }
                else if (position ==  3) {
                    Intent i = new Intent(Ocup.this, Pagamentos.class);
                    startActivity(i);
                }
                else if (position ==  4) {
                    Intent i = new Intent(Ocup.this, Pagamentos.class);
                    startActivity(i);
                }
                else if (position ==  5) {
                    Intent i = new Intent(Ocup.this, Pagamentos.class);
                    startActivity(i);
                }
            }
        });
        // so item click is done now check list view
    }

    class MyAdapter extends ArrayAdapter<String> {

        Context context;
        String rTitle[];
        String rDescription[];
        int rImgs[];

        MyAdapter (Context c, String title[], String description[], int imgs[]) {
            super(c, R.layout.row, R.id.textView1, title);
            this.context = c;
            this.rTitle = title;
            this.rDescription = description;
            this.rImgs = imgs;

        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.row, parent, false);
            ImageView images = row.findViewById(R.id.image);
            TextView myTitle = row.findViewById(R.id.textView1);
            TextView myDescription = row.findViewById(R.id.textView2);

            // now set our resources on views
            images.setImageResource(rImgs[position]);
            myTitle.setText(rTitle[position]);
            myDescription.setText(rDescription[position]);

            return row;
        }
    }
}
