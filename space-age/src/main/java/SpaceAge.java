public class SpaceAge {

    private Long ageInSeconds;

    public SpaceAge(long inputAgeInSeconds) {
        ageInSeconds = inputAgeInSeconds;
    }

    public Long getSeconds() {
        return ageInSeconds;
    }

    public Double onEarth() {
        return ageInSeconds.doubleValue() / 60.0 / 60.0 / 24.0 / 365.25;
    }

    public Double onMercury() {
        return onEarth() / 0.2408467;
    }

    public Double onVenus() {
        return onEarth() / 0.61519726;
    }

    public Double onMars() {
        return onEarth() / 1.8808158;
    }

    public Double onJupiter() {
        return onEarth() / 11.862615;
    }

    public Double onSaturn() {
        return onEarth() / 29.447498;
    }

    public Double onUranus() {
        return onEarth() / 84.016846;
    }

    public Double onNeptune() {
        return onEarth() / 164.79132;
    }

}
