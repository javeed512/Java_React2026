"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Employee = void 0;
var Employee = /** @class */ (function () {
    // eid:number;
    // ename:string;
    // constructor(eid,ename){
    //         this.eid = eid;
    //         this.ename = ename;
    // }
    function Employee(eid, ename) {
        this.eid = eid;
        this.ename = ename;
        this.eid = eid;
        this.ename = ename;
    }
    return Employee;
}());
exports.Employee = Employee;
var emp = new Employee(111, "king");
console.log(emp);
