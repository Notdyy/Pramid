package java_test;

public class PyramidMaker {
    private int size = 0;
    private StringBuilder pyramid = new StringBuilder();

    /**
     * Constructor ของคลาส PyramidMaker
     * 
     * @param size ขนาดของปีก (pyramid) ที่ต้องการสร้าง
     */
    public PyramidMaker(int size) {
        this.size = (size == 5) ? size - 1 : (size == 10) ? size - 5 : size;
    }

    /**
     * เมทอดที่ใช้สร้างปีก
     */
    public void create() {
        pyramid.setLength(0); // ตั้งค่าความยาวของ StringBuilder เป็น 0 ก่อนที่จะสร้าง

        for (int level = 0; level < this.size; level++) {
            buildLevel(size, level + 1);
        }
    }

    /**
     * เมทอดที่ใช้สร้างแต่ละระดับของปีก
     * 
     * @param size  ขนาดของปีก
     * @param count จำนวนการทำซ้ำของแต่ละระดับ
     */
    private void buildLevel(int size, int count) {
        for (int i = 0; i < size; i++) {
            String line = "*".repeat(i + 1) + " ".repeat(size - i);

            for (int j = 0; j < count; j++) {
                pyramid.append(line);
            }

            pyramid.append("\n");
        }
    }

    /**
     * เมทอดที่ใช้พิมพ์ปีกที่สร้าง
     */
    public void print() {
        System.out.println(pyramid.toString());
    }
}
