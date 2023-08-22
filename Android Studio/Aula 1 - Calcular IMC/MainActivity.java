<html>
<head>
<title>MainActivity.java</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<style type="text/css">
.s0 { color: #cc7832;}
.s1 { color: #a9b7c6;}
.s2 { color: #6a8759;}
.s3 { color: #6897bb;}
.s4 { color: #808080;}
</style>
</head>
<body bgcolor="#2b2b2b">
<table CELLSPACING=0 CELLPADDING=5 COLS=1 WIDTH="100%" BGCOLOR="#606060" >
<tr><td><center>
<font face="Arial, Helvetica" color="#000000">
MainActivity.java</font>
</center></td></tr></table>
<pre><span class="s0">package </span><span class="s1">com.example.myapplication</span><span class="s0">;</span>

<span class="s0">import </span><span class="s1">androidx.appcompat.app.AppCompatActivity</span><span class="s0">;</span>

<span class="s0">import </span><span class="s1">android.graphics.Color</span><span class="s0">;</span>
<span class="s0">import </span><span class="s1">android.os.Bundle</span><span class="s0">;</span>
<span class="s0">import </span><span class="s1">android.util.Log</span><span class="s0">;</span>
<span class="s0">import </span><span class="s1">android.view.View</span><span class="s0">;</span>
<span class="s0">import </span><span class="s1">android.widget.Button</span><span class="s0">;</span>
<span class="s0">import </span><span class="s1">android.widget.EditText</span><span class="s0">;</span>
<span class="s0">import </span><span class="s1">android.widget.TextView</span><span class="s0">;</span>

<span class="s0">public class </span><span class="s1">MainActivity </span><span class="s0">extends </span><span class="s1">AppCompatActivity {</span>

    <span class="s0">private </span><span class="s1">EditText edTexto</span><span class="s0">;</span>
    <span class="s0">private </span><span class="s1">EditText edPeso</span><span class="s0">;</span>
    <span class="s0">private </span><span class="s1">EditText edAltura</span><span class="s0">;</span>
    <span class="s0">private </span><span class="s1">Button btHomem</span><span class="s0">;</span>
    <span class="s0">private </span><span class="s1">Button btMulher</span><span class="s0">;</span>
    <span class="s0">private </span><span class="s1">Button btLimpar</span><span class="s0">;</span>
    <span class="s0">private </span><span class="s1">TextView tvResultado</span><span class="s0">;</span>

    <span class="s1">@Override</span>
    <span class="s0">protected void </span><span class="s1">onCreate(Bundle savedInstanceState) {</span>
        <span class="s0">super</span><span class="s1">.onCreate(savedInstanceState)</span><span class="s0">;</span>
        <span class="s1">setContentView(R.layout.activity_main)</span><span class="s0">;</span>

        <span class="s1">edPeso = findViewById(R.id.edPeso)</span><span class="s0">;</span>
        <span class="s1">edAltura = findViewById(R.id.edAltura)</span><span class="s0">;</span>
        <span class="s1">btHomem = findViewById(R.id.btHomem)</span><span class="s0">;</span>
        <span class="s1">btMulher = findViewById(R.id.btMulher)</span><span class="s0">;</span>
        <span class="s1">btLimpar = findViewById(R.id.btLimpar)</span><span class="s0">;</span>
        <span class="s1">tvResultado = findViewById(R.id.tvResultado)</span><span class="s0">;</span>

        <span class="s1">btHomem.setOnClickListener(</span><span class="s0">new </span><span class="s1">View.OnClickListener() {</span>
            <span class="s1">@Override</span>
            <span class="s0">public void </span><span class="s1">onClick(View view) {</span>
                <span class="s1">Double peso = Double.parseDouble(edPeso.getText().toString())</span><span class="s0">;</span>
                <span class="s1">Double altura = Double.parseDouble(edAltura.getText().toString())</span><span class="s0">;</span>
                <span class="s1">CalcularIMC(btHomem</span><span class="s0">, </span><span class="s1">peso</span><span class="s0">, </span><span class="s1">altura)</span><span class="s0">;</span>
            <span class="s1">}</span>
        <span class="s1">})</span><span class="s0">;</span>

        <span class="s1">btMulher.setOnClickListener(</span><span class="s0">new </span><span class="s1">View.OnClickListener() {</span>
            <span class="s1">@Override</span>
            <span class="s0">public void </span><span class="s1">onClick(View view) {</span>
                <span class="s1">Double peso = Double.parseDouble(edPeso.getText().toString())</span><span class="s0">;</span>
                <span class="s1">Double altura = Double.parseDouble(edAltura.getText().toString())</span><span class="s0">;</span>
                <span class="s1">CalcularIMC(btMulher</span><span class="s0">, </span><span class="s1">peso</span><span class="s0">, </span><span class="s1">altura)</span><span class="s0">;</span>
            <span class="s1">}</span>
        <span class="s1">})</span><span class="s0">;</span>

        <span class="s1">btLimpar.setOnClickListener(</span><span class="s0">new </span><span class="s1">View.OnClickListener() {</span>
            <span class="s1">@Override</span>
            <span class="s0">public void </span><span class="s1">onClick(View view) {</span>
                <span class="s1">edPeso.setText(</span><span class="s2">&quot;&quot;</span><span class="s1">)</span><span class="s0">;</span>
                <span class="s1">edAltura.setText(</span><span class="s2">&quot;&quot;</span><span class="s1">)</span><span class="s0">;</span>
                <span class="s1">tvResultado.setText(</span><span class="s2">&quot;&quot;</span><span class="s1">)</span><span class="s0">;</span>
            <span class="s1">}</span>
        <span class="s1">})</span><span class="s0">;</span>
    <span class="s1">}</span>

    <span class="s0">public void </span><span class="s1">CalcularIMC(Button tipo</span><span class="s0">, double </span><span class="s1">peso</span><span class="s0">, double </span><span class="s1">altura){</span>
        <span class="s0">double </span><span class="s1">imc = peso / (altura*altura)</span><span class="s0">;</span>
        <span class="s0">if</span><span class="s1">(tipo == btHomem){</span>
            <span class="s0">if </span><span class="s1">(imc &lt; </span><span class="s3">20.7</span><span class="s1">){</span>
                <span class="s1">tvResultado.setText(</span><span class="s2">&quot;Você está abaixo do peso! Com um IMC de: &quot; </span><span class="s1">+ imc)</span><span class="s0">;</span>
            <span class="s1">}</span><span class="s0">else if</span><span class="s1">(imc &lt; </span><span class="s3">26.4</span><span class="s1">){</span>
                <span class="s1">tvResultado.setText(</span><span class="s2">&quot;Você está no peso normal! Com um IMC de: &quot; </span><span class="s1">+ imc)</span><span class="s0">;</span>
            <span class="s1">}</span><span class="s0">else if</span><span class="s1">(imc &lt; </span><span class="s3">27.8</span><span class="s1">){</span>
                <span class="s1">tvResultado.setText(</span><span class="s2">&quot;Você está marginalmente acima do peso! Com um IMC de: &quot; </span><span class="s1">+ imc)</span><span class="s0">;</span>
            <span class="s1">}</span><span class="s0">else if</span><span class="s1">(imc &lt; </span><span class="s3">31.1</span><span class="s1">){</span>
                <span class="s1">tvResultado.setText(</span><span class="s2">&quot;Você está acima do peso ideal! Com um IMC de: &quot; </span><span class="s1">+ imc)</span><span class="s0">;</span>
            <span class="s1">}</span><span class="s0">else if</span><span class="s1">(imc &gt; </span><span class="s3">31.1</span><span class="s1">){</span>
                <span class="s1">tvResultado.setText(</span><span class="s2">&quot;Você está obeso! Com um IMC de: &quot; </span><span class="s1">+ imc)</span><span class="s0">;</span>
            <span class="s1">}</span>
        <span class="s1">}</span><span class="s0">else</span><span class="s1">{</span>
            <span class="s0">if </span><span class="s1">(imc &lt; </span><span class="s3">19.1</span><span class="s1">){</span>
                <span class="s1">tvResultado.setText(</span><span class="s2">&quot;Você está abaixo do peso! Com um IMC de: &quot; </span><span class="s1">+ imc)</span><span class="s0">;</span>
            <span class="s1">}</span><span class="s0">else if</span><span class="s1">(imc &lt; </span><span class="s3">25.8</span><span class="s1">){</span>
                <span class="s1">tvResultado.setText(</span><span class="s2">&quot;Você está no peso normal! Com um IMC de: &quot; </span><span class="s1">+ imc)</span><span class="s0">;</span>
            <span class="s1">}</span><span class="s0">else if</span><span class="s1">(imc &lt; </span><span class="s3">27.3</span><span class="s1">){</span>
                <span class="s1">tvResultado.setText(</span><span class="s2">&quot;Você está marginalmente acima do peso! Com um IMC de: &quot; </span><span class="s1">+ imc)</span><span class="s0">;</span>
            <span class="s1">}</span><span class="s0">else if</span><span class="s1">(imc &lt; </span><span class="s3">32.3</span><span class="s1">){</span>
                <span class="s1">tvResultado.setText(</span><span class="s2">&quot;Você está acima do peso ideal! Com um IMC de: &quot; </span><span class="s1">+ imc)</span><span class="s0">;</span>
            <span class="s1">}</span><span class="s0">else if</span><span class="s1">(imc &gt; </span><span class="s3">32.3</span><span class="s1">){</span>
                <span class="s1">tvResultado.setText(</span><span class="s2">&quot;Você está obeso! Com um IMC de: &quot; </span><span class="s1">+ imc)</span><span class="s0">;</span>
            <span class="s1">}</span>
        <span class="s1">}</span>
    <span class="s1">}</span>
<span class="s1">}</span>

<span class="s4">//</span>
<span class="s4">//    double peso = Double.parseDouble(edPeso.getText().toString());</span>
<span class="s4">//    double altura = Double.parseDouble(edAltura.getText().toString());</span>
<span class="s4">//    double res = peso / altura;</span>
<span class="s4">//    String resultado = String.valueOf(res);</span>
<span class="s4">//                tvResultado.setText(resultado);</span></pre>
</body>
</html>
