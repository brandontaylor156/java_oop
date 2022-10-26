public class Tree {
    double height;
    double trunkDiameter;
    TreeType treeType;

    Tree(double height, double trunkDiameter, TreeType treeType){
        this.height = height;
        this.trunkDiameter = trunkDiameter;
        this.treeType = treeType;
    }

    void grow(){
        this.height += 10;
        this.trunkDiameter += 1;
    }
}
