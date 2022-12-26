package com.example.demo.nahnson_javascript_moteur;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class myJavaScript {

    public static void main(String[] args) throws ScriptException {
        //
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("nashorn");
        String script = "var name='MOHAMED AMINE RAJAH' ; name";
        Object myObject = engine.eval(script);
        System.out.println(myObject);

    }
}
