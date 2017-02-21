// JavaScript Document
function slowScroll (id) {
    var offset = 130;
    $('jsp, body').animate ({
      scrollTop: $(id).offset ().top - offset
    }, 1000);
    return false;
  }
 