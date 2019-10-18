package br.senac.go;

import static j2html.TagCreator.*;
import j2html.tags.ContainerTag;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Webservices {

    static String[] MODULOS = {
        "Adriel", "Anibal",
        "Brendon", "Fabioa",
        "Fabioc", "Iury",
        "Izaias", "Joaoc",
        "Joaor", "Maidno",
        "Marcelo", "Nicholas",
        "Rafaelc", "Rafaelg",
        "Wilker", "Yuri", "Braully"
    };

    @GetMapping("/modulos")
    public String modulos() {
        ContainerTag html = html();
        ContainerTag body = body();
        ContainerTag ul = ul();
        body.with(ul);
        Arrays.stream(MODULOS).forEach(m -> ul.with(li(a(m).withHref(m + ".html"))));
        return html.with(body).renderFormatted();
    }

    @GetMapping("/hello")
    public Collection<String> sayHello() {
        return IntStream.range(0, 10)
                .mapToObj(i -> "Hello number " + i)
                .collect(Collectors.toList());
    }
}
