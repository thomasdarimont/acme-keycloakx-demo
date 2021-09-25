package com.github.thomasdarimont.keycloakx;

import io.quarkus.runtime.Quarkus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Server {

    public static void main(String[] args) {
        List<String> devArgs = new ArrayList<>();

        devArgs.addAll(Arrays.asList(args));

        if (devArgs.isEmpty()) {
            devArgs.add("start-dev");
        }

        Quarkus.run(devArgs.toArray(new String[devArgs.size()]));
    }
}
