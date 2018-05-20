package com.sahilm;

import org.jooby.Jooby;

public class App extends Jooby {

    {
        get("/search", (req, rsp) -> {
            final Profile profile = req.params(Profile.class);
            System.out.println(profile);
        });
    }

    public static void main(final String[] args) {
        run(App::new, args);
    }

}
