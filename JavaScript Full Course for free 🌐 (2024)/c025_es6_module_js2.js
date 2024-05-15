export const pi = 3.14159265359;
export function getCircumference(radius) {
    return 2 * pi * radius;
}
export function getArea(radius) {
    return pi * radius * radius;
}
export function getVolumeSphere(radius) {
    return 4 / 3 * pi * radius * radius * radius;
}
export function getVolumeCylinder(radius, height) {
    return pi * radius * radius * height;
}
// export { getCircumference, getArea, getVolumeSphere, getVolumeCylinder }; // this is for exporting multiple functions or variables