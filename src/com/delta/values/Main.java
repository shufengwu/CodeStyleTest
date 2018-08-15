package com.delta.values;

import java.io.File;

public class Main {

    static final int width_size = 1080;  // 设定尺寸 640x1136  750x1334
    static final int height_size = 1920; // 设定尺寸 640x1136  750x1334

    public static void main(String[] args) {
        String pathname = "";

        // 屏幕 宽(x),高(y) 像素
        int[] list_x = {320, 480, 480, 540, 600, 768, 640, 735, 720, 720, 720, 800, 1080, 750, 1080, 1440, 3220};
        int[] list_y = {480, 800, 854, 960, 1024, 1024, 1136, 1152, 1184, 1196, 1280, 1280, 1812, 1334, 1920, 2560, 4500};

        int length = list_x.length;
        String[] list_name = new String[length];
        for (int i = 0; i < length; i++) {
            list_name[i] = "values-" + list_y[i] + "x" + list_x[i];
        }

        int size = list_name.length;
        for (int i = 0; i < size; i++) {
            File directory = new File(""); // 设定为当前文件夹

            try {
                String absolutePath = directory.getAbsolutePath();
                pathname = absolutePath + "/asset/" + list_name[i] + "/";
                File file = new File(pathname);
                if (!file.exists()) {
                    file.mkdirs();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }


            float level_x = (float) list_x[i] / width_size;  // 宽 单位值
            float level_y = (float) list_y[i] / height_size; // 高 单位值

            toCreateWidth(pathname, level_x);
            toCreateHeight(pathname, level_y);
        }

    }

    /**
     * 生成屏幕宽度文件
     *
     * @param pathname
     * @param level_y
     */
    private static void toCreateWidth(String pathname, float level_y) {

        StringBuilder builder = new StringBuilder();
        builder.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<resources>");
        for (int i = 1; i <= width_size; i++) {
            float real_y = level_y * i;
            builder.append("<dimen name=\"x" + i + "\">" + String.format("%.2f", real_y) + "px</dimen>");
        }
        builder.append("</resources>");

        //XMLUtils.writeFile(pathname, builder.toString(), "lay_x");
    }

    /**
     * 生成屏幕高度文件
     *
     * @param pathname
     * @param level_y
     */
    private static void toCreateHeight(String pathname, float level_y) {

        StringBuilder builder = new StringBuilder();
        builder.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<resources>");
        for (int i = 1; i <= height_size; i++) {
            float real_x = level_y * i;
            builder.append("<dimen name=\"y" + i + "\">" + String.format("%.2f", real_x) + "px</dimen>");
        }
        builder.append("</resources>");

        //XMLUtils.writeFile(pathname, builder.toString(), "lay_y");
    }
}
