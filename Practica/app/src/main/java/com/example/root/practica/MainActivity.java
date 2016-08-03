package com.example.root.practica;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView texto;
    Button uno,dos,tres,cuatro,cinco,seis,siete,ocho,nueve,cero,mas,menos,prod,div,igual,coma,c;
    String valorTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        uno = (Button) findViewById(R.id.btn1);
        dos = (Button) findViewById(R.id.btn2);
        tres = (Button) findViewById(R.id.btn3);
        cuatro = (Button) findViewById(R.id.btn4);
        cinco = (Button) findViewById(R.id.btn5);
        seis = (Button) findViewById(R.id.btn6);
        siete = (Button) findViewById(R.id.btn7);
        ocho = (Button) findViewById(R.id.btn8);
        nueve = (Button) findViewById(R.id.btn9);
        cero = (Button) findViewById(R.id.btn0);
        mas = (Button) findViewById(R.id.btnSuma);
        menos = (Button) findViewById(R.id.btnResta);
        prod = (Button) findViewById(R.id.btnProd);
        div = (Button) findViewById(R.id.btnDiv);
        igual = (Button) findViewById(R.id.btnIgual);
        coma = (Button) findViewById(R.id.btnComa);
        c = (Button) findViewById(R.id.btnC);

        texto = (TextView) findViewById(R.id.editText);

        uno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valorTotal=texto.getText()+"";
                texto.setText(valorTotal+"1");
            }
        });
        dos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valorTotal=texto.getText()+"";
                texto.setText(valorTotal+"2");
            }
        });
        tres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valorTotal=texto.getText()+"";
                texto.setText(valorTotal+"3");
            }
        });
        cuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valorTotal=texto.getText()+"";
                texto.setText(valorTotal+"4");
            }
        });
        cinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valorTotal=texto.getText()+"";
                texto.setText(valorTotal+"5");
            }
        });
        seis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valorTotal=texto.getText()+"";
                texto.setText(valorTotal+"6");
            }
        });
        siete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valorTotal=texto.getText()+"";
                texto.setText(valorTotal+"7");
            }
        });
        ocho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valorTotal=texto.getText()+"";
                texto.setText(valorTotal+"8");
            }
        });
        nueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valorTotal=texto.getText()+"";
                texto.setText(valorTotal+"9");
            }
        });
        cero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valorTotal=texto.getText()+"";
                texto.setText(valorTotal+"0");
            }
        });

        mas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valorTotal=texto.getText()+"";
                texto.setText(valorTotal+"+");
            }
        });
        menos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valorTotal=texto.getText()+"";
                texto.setText(valorTotal+"-");
            }
        });
        prod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valorTotal=texto.getText()+"";
                texto.setText(valorTotal+"*");
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valorTotal=texto.getText()+"";
                texto.setText(valorTotal+"/");
            }
        });
        coma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valorTotal=texto.getText()+"";
                texto.setText(valorTotal+",");
            }
        });
        igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valorTotal=texto.getText()+"";
                texto.setText(Operar(valorTotal)+"");
            }
        });

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valorTotal="";
                texto.setText("");
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    protected String Operar(String datos){
        System.out.println("Los datos a operar son: "+datos);
        double resultado=0;
        String numero="";
        char operando=' ';
        int cont=0;
        if (datos.length()>0){
            for (int i=0; i<datos.length();i++){
                if (Character.isDigit(datos.charAt(i))){
                    numero = numero + datos.charAt(i);
                    System.out.println("El numero: "+numero);
                }else if(datos.charAt(i)==','){
                    numero = numero + '.';
                }

                if (datos.charAt(i)=='+' || datos.charAt(i)=='-' || datos.charAt(i)=='*' || datos.charAt(i)=='/' || i == datos.length()-1) {
                    cont++;
                    if(cont==1){
                        resultado = Integer.parseInt(numero);
                    }

                    if(operando ==' '){
                        operando = datos.charAt(i);
                        System.out.println("El operando: "+operando);
                    }else{
                        switch (operando){
                            case '+':
                                System.out.println("Opera: "+resultado+"+"+numero);
                                resultado = resultado + Double.parseDouble(numero);
                                break;
                            case '-':
                                System.out.println("Opera: "+resultado+"-"+numero);
                                resultado = resultado - Double.parseDouble(numero);
                                break;
                            case '*':
                                System.out.println("Opera: "+resultado+"*"+numero);
                                resultado = resultado * Double.parseDouble(numero);
                                break;
                            case '/':
                                System.out.println("Opera; "+resultado+"/"+numero);
                                resultado = resultado / Double.parseDouble(numero);
                                break;
                            default:
                                return "Error";
                        }
                        operando=datos.charAt(i);
                    }
                    numero="";
                }
            }
        }else{
            return "0";
        }
        return resultado+"";
    }
}
