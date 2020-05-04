package com.example.mesacerta;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class Menu extends AppCompatActivity {
    ListView c;
    ListView l;
    String cTitle[] = {"Caffè Americano","Blonde Caffè Americano", "Blonde Roast", "Caffé Misto", "Featured Dark Roat Coffee", "Pike Place Roast", "Decaf Pike Place Roast", "Cappuccino", "Blonde Cappucino"};
    String lTitle[] = {"Crispy Grilled Cheese Sandwish","Ham & Swiss Panini","Turkey & Basil Pesto","Chicken Caprese","Chicken & Double - Smoked Bacon","Tomato & Mozzarella","Avocado Spread","Eggs & Cheese Protein Box"};
    String cDescription[] = {"Espresso shots topped with hot water create a light layer of crema culminating in this wonderfully rich cup with depth and nuance", "Espresso shots topped with hot water to produce a light layer of crema and are made with our Starbucks® Blonde Roast for an extra-smooth, subtly sweet and nuanced cup", "Lightly roasted coffee that's soft, mellow and flavorful. Easy-drinking on its own and delicious with milk, sugar or flavored with vanilla, caramel or hazelnut","A one-to-one combination of fresh-brewed coffee and steamed milk add up to one distinctly delicious coffee drink remarkably mixed", "This full-bodied dark roast coffee with bold, robust flavors showcases our roasting and blending artistry—an essential blend of balanced and lingering flavors", "In 2008 our master blenders and roasters created this for you—a smooth, well-rounded blend of Latin American coffees with subtly rich flavors of chocolate and toasted nuts, it’s served fresh every day at a Starbucks® store near you", "In 2008 our master blenders and roasters created this for you—a smooth, well-rounded blend of Latin American coffees with subtly rich flavors of chocolate and toasted nuts, it’s served fresh every day at a Starbucks® store near you. (Decaf as you like it.)", "Dark, rich espresso lies in wait under a smoothed and stretched layer of thick milk foam. An alchemy of barista artistry and craft.", "Our seriously smooth and subtly sweet Starbucks® Blonde Espresso lies in wait under a smoothed and stretched layer of thick foam. This cappuccino offers a luxurious texture and velvety, frothy foam with a crisp, cool undercurrent."};
    String lDescription[] = {"A delicious blend of white Cheddar and mozzarella cheeses on sourdough bread, topped with a Parmesan butter spread. ","Ham and Swiss cheese meld with Dijon butter in comforting warmth. An extraordinary feel-good taste.","Thick-sliced turkey and melted provolone cheese stacked on a ciabatta roll, then topped with our signature basil pesto and dry-roasted red peppers. So tasty, you'll want seconds, but so satisfying, you won't need them. Turkeys are raised without the use of antibiotics.","Stacked with craveable ingredients, including slow-cooked chicken, mozzarella, balsamic-marinated tomatoes, basil pesto and spinach, all nestled between soft ciabatta bread. . Chickens are raised without the use of antibiotics.","Herbed chicken is slow-cooked and piled high on toasted apple brioche, topped with our double-smoked bacon and maple mustard. . Chickens are raised without the use of antibiotics.","Roasted tomatoes, mozzarella, spinach and basil pesto layered on a toasted focaccia—a satisfyingly delicious delight.","Spruce up your sandwich or sous vide egg bites with avocado mixed with a touch of spices and lime. This Avocado Spread is made using a high-pressure process designed to maintain freshness without the use of heat, additives or preservatives.","Two cage-free hardboiled eggs, sliced tart apples, a mandarin and white Cheddar cheese come together with multigrain muesli bread and honey peanut butter in this protein-packed lover's dream."};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        c = findViewById(R.id.café);
        l = findViewById(R.id.lanche);
        MeuAdaptador cadapt = new MeuAdaptador(this, cTitle, cDescription);
        MeuAdaptador ladapt = new MeuAdaptador(this, lTitle, lDescription);
        c.setAdapter(cadapt);
        l.setAdapter(ladapt);

    }
}

class MeuAdaptador  extends ArrayAdapter<String> {

    Context context;
    String rTitle[];
    String rDescription[];

    MeuAdaptador (Context c, String title[], String description[]) {
        super(c, R.layout.row, R.id.textView1, title);
        this.context = c;
        this.rTitle = title;
        this.rDescription = description;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row = layoutInflater.inflate(R.layout.row, parent, false);
        TextView myTitle = row.findViewById(R.id.textView1);
        TextView myDescription = row.findViewById(R.id.textView2);

        // now set our resources on views
        myTitle.setText(rTitle[position]);
        myDescription.setText(rDescription[position]);

        return row;
    }
}
