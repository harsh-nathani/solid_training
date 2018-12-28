class CarsDb
{
	private List<Car> _carsDb = Arrays
        .asList(new Car("1", "Golf III", "Volkswagen"), new Car("2", "Multipla", "Fiat"),
            new Car("3", "Megane", "Renault"));
			
	public CarsDb(List<Car> carsDb)
	{
		_carsDb = carsDb;
	}
	
	public List getList()
    {
        return _carsDb;
    }
	
}