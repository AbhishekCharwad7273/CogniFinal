function playAudio(rank) {
    var myAudio1 = document.getElementById("myAudio1");
    var myAudio2 =  document.getElementById("myAudio2");
    var myAudio3 =  document.getElementById("myAudio3");
    if (rank == "first")
       myAudio1.play();
    else if (rank == "second") {
        myAudio2.play();
    }
    else {
        myAudio3.play();
    }
};

function endAudio(rank){
    if(rank == 'first' && myAudio1.ended){
        setTimeout(() => {
            myAudio2.play();
        }, 2000);
    }else if(rank == 'second' && myAudio2.ended){
        setTimeout(() => {
            myAudio3.play();
        }, 2000);
    }else{
        if(rank == 'third' && myAudio3.ended){
            setTimeout(() => {
                myAudio1.play();
            }, 2000);
        }
    }
}
