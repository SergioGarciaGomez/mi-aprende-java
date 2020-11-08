oncontextmenu = function() { return false }

var music = document.createElement("audio");

function Carta() {
    var carta = document.getElementsByClassName("carta")[0];
    carta.src = "index_files/assets/images/scroll.png";

    var marco_carta = document.getElementsByClassName("marco-scroll-cerrado")[0];
    marco_carta.style.display = "none";

    var marco_carta = document.getElementsByClassName("scroll-cerrado")[0];
    marco_carta.style.display = "none";

    var textocarta = document.getElementsByClassName("textocarta")[0];
    textocarta.style.visibility = "visible";

    var flecha = document.getElementsByClassName("flecha")[0];
    flecha.style.visibility = "visible";

    music.src = "index_files/assets/audio/truco.mp3";
    music.setAttribute("loop", "");
    music.volume = 0.6;
    music.play();
}

var bat = document.getElementsByClassName("bat");

function Casa() {

    music.src = "index_files/assets/audio/swamp.mp3";
    music.setAttribute("loop", "");
    music.volume = 1;
    music.play();

    var fondo = document.getElementById("fondo2");
    fondo.classList.remove("fondo1");
    fondo.classList.add("fondo2");

    var flecha = document.getElementsByClassName("flecha")[0];
    flecha.style.display = "none"

    var textocarta = document.getElementsByClassName("textocarta")[0];
    textocarta.style.display = "none";

    var bat = document.getElementsByClassName("bat")[0];
    bat.style.visibility = "visible";

    var fog = document.getElementsByClassName("fog")[0];
    fog.style.visibility = "visible";
}

function CuadroTexto() {

}