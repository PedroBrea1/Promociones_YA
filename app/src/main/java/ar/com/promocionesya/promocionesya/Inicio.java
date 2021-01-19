package ar.com.promocionesya.promocionesya;

import android.content.Intent;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

public class Inicio extends AppCompatActivity {

    private DrawerLayout drawerLayout;
    private LinearLayout mainLayout;
    private ListView menuLateral;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        ActionBar aBar = getSupportActionBar();
        aBar.setHomeButtonEnabled(true);
        aBar.setDisplayHomeAsUpEnabled(true);


        drawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        mainLayout = (LinearLayout) findViewById(R.id.mainLayout);
        menuLateral = (ListView) findViewById(R.id.menuLateral);



        String[] opciones = {"Supermercados", "Indumentaria", "Combustible", "Gastronomia", "Belleza y Salud", "Servicios", "Escolar", "Limpieza"};
        ArrayAdapter<String> adp = new ArrayAdapter<String>(Inicio.this, android.R.layout.simple_expandable_list_item_1, opciones);
        menuLateral.setAdapter(adp);

        menuLateral.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String opcSeleccionado = (String) menuLateral.getAdapter().getItem(position);

                Toast.makeText(Inicio.this, opcSeleccionado, Toast.LENGTH_SHORT).show();
                drawerLayout.closeDrawer(menuLateral);
            }
        });

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,opciones);

        menuLateral.setAdapter(adapter);
        menuLateral.setBackgroundColor(getResources().getColor(R.color.colorPrimary));

        menuLateral.setOnItemClickListener(new AdapterView.OnItemClickListener() {



            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(getApplicationContext(),"Position"+position,Toast.LENGTH_SHORT).show();
                switch (position) {
                    case 0:
                        Intent a = new Intent(getApplicationContext(), Supermercados.class);
                        startActivity(a);
                        break;

                    case 1:
                        Intent b = new Intent(getApplicationContext(), Indumentaria.class);
                        startActivity(b);
                        break;
                    case 2:
                        Intent c = new Intent(getApplicationContext(), Combustible.class);
                        startActivity(c);
                        break;
                    case 3:
                        Intent d = new Intent(getApplicationContext(), Gastronomia.class);
                        startActivity(d);
                        break;
                    case 4:
                        Intent e = new Intent(getApplicationContext(), BellezaySalud.class);
                        startActivity(e);
                        break;
                    default:
                        break;
                }
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == android.R.id.home) {
            if (drawerLayout.isDrawerOpen(menuLateral)) {
                drawerLayout.closeDrawer(menuLateral);
            } else {
                drawerLayout.openDrawer(menuLateral);
            }
        }
        return false;


    }
}
