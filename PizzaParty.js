"use strict";



// FIRST POP UP MODAL

function PopUp(hideOrshow) {
    if (hideOrshow === 'hide') document.getElementById('ac-wrapper').style.display = "none";

    else document.getElementById('ac-wrapper').removeAttribute('style');
}

window.onload = function () {
    setTimeout(function () {
        PopUp('show');
    }, 1000);
};




// END OF FIRST POP UP MODAL

let currentDroppable = null;
// let toppings = document.querySelectorAll('[#pepperoni1, #pineapple, #blackolive]');
//
//

// var toppings = $("#pepperoni1,#pineapple");
pepperoni1.onmousedown = function(event) {

    let shiftX = event.clientX - pepperoni1.getBoundingClientRect().left;
    let shiftY = event.clientY - pepperoni1.getBoundingClientRect().top;

    pepperoni1.style.position = 'absolute';
    pepperoni1.style.zIndex = 1000;
    document.body.append(pepperoni1);

    moveAt(event.pageX, event.pageY);

    function moveAt(pageX, pageY) {
        pepperoni1.style.left = pageX - shiftX + 'px';
        pepperoni1.style.top = pageY - shiftY + 'px';
    }

    function onMouseMove(event) {
        moveAt(event.pageX, event.pageY);

        pepperoni1.hidden = true;
        let elemBelow = document.elementFromPoint(event.clientX, event.clientY);
        pepperoni1.hidden = false;

        if (!elemBelow) return;

        let droppableBelow = elemBelow.closest('.droppable');
        if (currentDroppable !== droppableBelow) {
            if (currentDroppable) { // null when we were not over a droppable before this event
                leaveDroppable(currentDroppable);
            }
            currentDroppable = droppableBelow;
            if (currentDroppable) { // null if we're not coming over a droppable now
                // (maybe just left the droppable)
                enterDroppable(currentDroppable);
            }
        }
    }

    document.addEventListener('mousemove', onMouseMove);

    pepperoni1.onmouseup = function() {
        document.removeEventListener('mousemove', onMouseMove);
        pepperoni1.onmouseup = null;
    };

};

function enterDroppable(elem) {
    elem.style.background = 'pink';
}

function leaveDroppable(elem) {
    elem.style.background = '';
}

pepperoni1.ondragstart = function() {
    return false;
};

// Trying a different one --------------------------------------------------------

// function interact(s) {
//     // target elements with the "draggable" class
//     interact('.draggable')
//         .draggable({
//             // enable inertial throwing
//             inertia: true,
//             // keep the element within the area of it's parent
//             modifiers: [
//                 interact.modifiers.restrictRect({
//                     restriction: 'parent',
//                     endOnly: true
//                 })
//             ],
//             // enable autoScroll
//             autoScroll: true,
//
//             // call this function on every dragmove event
//             onmove: dragMoveListener,
//             // call this function on every dragend event
//             onend: function (event) {
//                 var textEl = event.target.querySelector('p')
//
//                 textEl && (textEl.textContent =
//                     'moved a distance of ' +
//                     (Math.sqrt(Math.pow(event.pageX - event.x0, 2) +
//                         Math.pow(event.pageY - event.y0, 2) | 0))
//                         .toFixed(2) + 'px')
//             }
//         });
//
//     function dragMoveListener (event) {
//         var target = event.target;
//         // keep the dragged position in the data-x/data-y attributes
//         var x = (parseFloat(target.getAttribute('data-x')) || 0) + event.dx;
//         var y = (parseFloat(target.getAttribute('data-y')) || 0) + event.dy;
//
//         // translate the element
//         target.style.webkitTransform =
//             target.style.transform =
//                 'translate(' + x + 'px, ' + y + 'px)';
//
//         // update the posiion attributes
//         target.setAttribute('data-x', x);
//         target.setAttribute('data-y', y)
//     }
//
// // this is used later in the resizing and gesture demos
//     window.dragMoveListener = dragMoveListener;
//
// }

