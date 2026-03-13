var Demo = /** @class */ (function () {
    function Demo() {
        this.sid = 101;
        this.sname = "Tommy";
    }
    Demo.prototype.Demo = function () {
        console.log("Demo() is called.");
    };
    Demo.prototype.m1 = function () {
        console.log("m1() is called");
        console.log(this.sid);
        console.log(this.sname);
    };
    return Demo;
}());
var d = new Demo();
d.m1();
