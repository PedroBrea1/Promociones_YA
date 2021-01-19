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
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

public class Gastronomia extends AppCompatActivity {

    private DrawerLayout drawerLayout;
    private LinearLayout mainLayout;
    private Button bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, bt10, bt11, bt12, bt13, bt14, bt15, bt16, bt17, bt18, bt19, bt20, bt21, bt22, bt23, bt24, bt25, bt26, bt27;
    private ListView menuLateral;
    private ImageView pantalla;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gastronomia);

        ActionBar aBar = getSupportActionBar();
        aBar.setHomeButtonEnabled(true);
        aBar.setDisplayHomeAsUpEnabled(true);


        drawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        mainLayout = (LinearLayout) findViewById(R.id.mainLayout);
        menuLateral = (ListView) findViewById(R.id.menuLateral);

        bt1 = (Button)findViewById(R.id.bt1);
        bt2 = (Button)findViewById(R.id.bt2);
        bt3 = (Button)findViewById(R.id.bt3);
        bt4 = (Button)findViewById(R.id.bt4);
        bt5 = (Button)findViewById(R.id.bt5);
        bt6 = (Button)findViewById(R.id.bt6);
        bt7 = (Button)findViewById(R.id.bt7);
        bt8 = (Button)findViewById(R.id.bt8);
        bt9 = (Button)findViewById(R.id.bt9);
        bt10 = (Button)findViewById(R.id.bt10);
        bt11 = (Button)findViewById(R.id.bt11);
        bt12 = (Button)findViewById(R.id.bt12);
        bt13 = (Button)findViewById(R.id.bt13);
        bt14 = (Button)findViewById(R.id.bt14);
        bt15 = (Button)findViewById(R.id.bt15);
        bt16 = (Button)findViewById(R.id.bt16);
        bt17 = (Button)findViewById(R.id.bt17);
        bt18 = (Button)findViewById(R.id.bt18);
        bt19 = (Button)findViewById(R.id.bt19);
        bt20 = (Button)findViewById(R.id.bt20);
        bt21 = (Button)findViewById(R.id.bt21);
        bt22 = (Button)findViewById(R.id.bt22);
        bt23 = (Button)findViewById(R.id.bt23);
        bt24 = (Button)findViewById(R.id.bt24);
        bt25 = (Button)findViewById(R.id.bt25);
        pantalla = (ImageView) findViewById(R.id.pantalla);

        bt1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                pantalla.setImageResource(R.drawable.lcomafi);
            }
        });

        bt2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                pantalla.setImageResource(R.drawable.lgalicia);
            }
        });

        bt3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                pantalla.setImageResource(R.drawable.lciudad);
            }
        });

        bt4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                pantalla.setImageResource(R.drawable.lsantander);
            }
        });

        bt5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                pantalla.setImageResource(R.drawable.lhsbc);
            }
        });

        bt6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                pantalla.setImageResource(R.drawable.lcomafi);
            }
        });

        bt7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                pantalla.setImageResource(R.drawable.lgalicia);
            }
        });

        bt8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                pantalla.setImageResource(R.drawable.lciudad);
            }
        });

        bt9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                pantalla.setImageResource(R.drawable.lsantander);
            }
        });
        bt10.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                pantalla.setImageResource(R.drawable.lhsbc);
            }
        });


        bt11.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                pantalla.setImageResource(R.drawable.lcomafi);
            }
        });

        bt12.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                pantalla.setImageResource(R.drawable.lgalicia);
            }
        });

        bt13.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                pantalla.setImageResource(R.drawable.lciudad);
            }
        });

        bt14.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                pantalla.setImageResource(R.drawable.lsantander);
            }
        });

        bt15.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                pantalla.setImageResource(R.drawable.lhsbc);
            }
        });

        bt16.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                pantalla.setImageResource(R.drawable.lcomafi);
            }
        });

        bt17.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                pantalla.setImageResource(R.drawable.lgalicia);
            }
        });

        bt18.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                pantalla.setImageResource(R.drawable.lciudad);
            }
        });

        bt19.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                pantalla.setImageResource(R.drawable.lsantander);
            }
        });

        bt20.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                pantalla.setImageResource(R.drawable.lhsbc);
            }
        });

        bt21.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                pantalla.setImageResource(R.drawable.lcomafi);
            }
        });

        bt22.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                pantalla.setImageResource(R.drawable.lgalicia);
            }
        });

        bt23.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                pantalla.setImageResource(R.drawable.lciudad);
            }
        });

        bt24.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                pantalla.setImageResource(R.drawable.lhsbc);
            }
        });

        bt25.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                pantalla.setImageResource(R.drawable.lhsbc);
            }
        });





        String[] opciones = {"Supermercados", "Indumentaria", "Combustible", "Gastronomia", "Belleza y Salud", "Servicios", "Escolar", "Limpieza"};
        ArrayAdapter<String> adp = new ArrayAdapter<String>(Gastronomia.this, android.R.layout.simple_expandable_list_item_1, opciones);
        menuLateral.setAdapter(adp);

        menuLateral.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String opcSeleccionado = (String) menuLateral.getAdapter().getItem(position);

                Toast.makeText(Gastronomia.this, opcSeleccionado, Toast.LENGTH_SHORT).show();
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
