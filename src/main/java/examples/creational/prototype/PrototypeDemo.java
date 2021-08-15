package examples.creational.prototype;

import examples.creational.prototype.properimplementation.TemplateRegistry;

public class PrototypeDemo {

    //typically, used when creation is expensive
    //example - clone (deep / shallow)
    //
    // Prototype not quiet a pattern, rather - framework
    public static void main(String[] args) {
        testPrototypeCloneable();
        properPrototypeTest();
    }

    private static void properPrototypeTest() {
        TemplateRegistry tr = new TemplateRegistry();
        var movieFromTemplate = tr.createItem(TemplateRegistry.MEDIA_TYPE.MOVIE);
        System.out.println("got from template:"+movieFromTemplate.getTitle());
        movieFromTemplate.setTitle("customized title");
        System.out.println("after customization:"+movieFromTemplate.getTitle());

    }

    private static void testPrototypeCloneable() {

        //shallow clone
        var baseClass = new ExpensiveToCreateClass();
        var clonedClass = baseClass.clone();

        System.out.println("------------"+baseClass);
        System.out.println("------------"+clonedClass);
    }

}
