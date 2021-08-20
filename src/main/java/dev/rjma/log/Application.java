package dev.rjma.log;

import dev.rjma.sic.Generator;

import java.nio.file.Paths;

public class Application {

    public static void main(String[] args) {
        new Generator().generate(Paths.get("log/src/main/resources/log"), Paths.get("log/target/log"));
    }
}
