import java.lang.Math;

/**
 * Razširitev <code>java.lang.Math</code> razreda.
 *
 * @author Jurij Fortuna
 * @version 8. 12. 2022
 */
public class MojeKotnePretvorbe {
    private static final double GRADIAN_DEGREES = 0.9;
    private static final double DEGREES_MRAD = 17.453_292_519_943;
    private static final double MRAD_DEGREES = 0.057296;
    private static final double AZIMUT_DEG = 17.46;

    /**
     * Metoda pretvori gradiane v stopinje
     *
     * @param grads število gradianov
     * @return stopinje
     */
    public static double gradToDegrees(double grads) {
        return grads * GRADIAN_DEGREES;
    }

    /**
     * Metoda pretvori gradiane v radiane
     *
     * @param grads število gradianov
     * @return število radianov
     */
    public static double gradToRadians(double grads) {
        return Math.toRadians(gradToDegrees(grads));
    }

    /**
     * Metoda pretvori stopinje v radiane
     *
     * @param degrees število stoping
     * @return število gradianov
     */
    public static double toGradFromDegrees(double degrees) {
        return degrees * (Math.PI / 180);
    }

    /**
     * Metoda pretvori radiane v gradiane
     *
     * @param rads število radianov
     * @return število gradianov
     */
    public static double toGradFromRadians(double rads) {
        return toGradFromDegrees(Math.toDegrees(rads));
    }

    /**
     * Metoda pretvori stopinje v m-radiane
     *
     * @param degrees število stopinj
     * @return število m-radianov
     */
    public static double degreesToMrad(double degrees) {
        return degrees * DEGREES_MRAD;
    }

    /**
     * Metoda pretvori m-radiane v stopinje
     *
     * @param mrads število m-radianov
     * @return število stoping
     */
    public static double mradsToDegrees(double mrads) {
        return mrads * MRAD_DEGREES;
    }

    /**
     * Metoda pretvori stopinje v azimute
     *
     * @param degrees število stopinj
     * @return število azimutov
     */
    public static double degreesToAzimuth(double degrees) {
        return degrees * AZIMUT_DEG;
    }

    /**
     * Metoda pretvori azimute v stopinje
     *
     * @param azimuths število azimutov
     * @return število stopinj
     */
    public static double azimuthToDegrees(double azimuths) {
        return azimuths / AZIMUT_DEG;
    }
}
