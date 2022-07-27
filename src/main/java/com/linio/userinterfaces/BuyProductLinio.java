package com.linio.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class BuyProductLinio extends PageObject {
    public static final Target IMAGE_SEARCH_ARTICLE = Target.the("Imagen(Lupa) de busqueda del articulo").located(By.id("ivLeftIcon"));
    public static final Target INPUT_ARTICLE = Target.the("Campo de texto para el ingreso del nombre del articulo a buscar").located(By.id("etSearchText"));
    public static final Target LABEL_ARTICLE_SEARCH = Target.the("producto a seleccionar").locatedBy("//*[@text='{0}']");
    public static final Target LABEL_ARTICLE_SELECTED = Target.the("").located(By.id("llContent"));
    public static final Target IMAGE_ADD_TO_CART = Target.the("Imagen Carrito de compras para adicionar la compra").located(By.id("ivAddToCart"));
    public static final Target IMAGE_CART = Target.the("Imagen Carrito de compras para mirar los registros de los productos que he seleccionado para la compra").located(By.id("ivActionCart"));
    public static final Target IMAGE_CATEGORIES = Target.the("Imagen para seleccionar la opcion de categorias de los productos").located(By.id("categories"));
    public static final Target ARTICLE_TYPE_IMAGE = Target.the("Imagen correspondiente a la categoria de ").locatedBy("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.ImageView");
    public static final Target BUTTON_ORDER=Target.the("Boton para seleccionar el orden que se presentara los productos").located(By.id("flSortBy"));
    public static final Target MENU_ORDER=Target.the("Tipo de orden que aplicaremos para presentar los productos").locatedBy(("//*[@text='Menor precio']"));


}
