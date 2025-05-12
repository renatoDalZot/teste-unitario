package org.db;

import java.util.function.Function;

public class ParadigmaFuncional {

    Function saudacao = (Object name) -> {
        return "Olá, " + name + "!";
    };
}
