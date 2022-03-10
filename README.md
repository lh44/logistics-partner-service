Logistics Partner Service

APIs needed
* Add delivery partner
* Add account
* Check serviceability - Integration with logistics partner needed
* Transit time - Integration with logistics partner needed
* Register pickup/Create order - Integration with logistics partner needed
* Check order status/Tracking the shipment - Integration with logistics partner needed
* Cancel pickup - Integration with logistics partner needed

RDBMS data
* Delivery Partner - ID, Name, API URL, any additional parameters
* Delivery partner account - ID, FK_Delivery_Partner, Username, password/api_key
* Orders - ID, Creation & Update timestamp, FK_Delivery_Partner_Account, Cost(for reporting), Status(Initiated, Placed, Delivered, Canceled, Failed), Images
  and any other fields we need to display without querying the delivery partner