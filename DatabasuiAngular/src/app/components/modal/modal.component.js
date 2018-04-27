function scrollView() {
    var selectElement = document.getElementById("select"), selectQuery = document.getElementById("selectColumn");

    console.log("script opened");

    selectElement.addEventListener("click", function () {
        console.log("function entered");
        selectQuery.scrollIntoView();
        console.log("event listened");
    });
}
