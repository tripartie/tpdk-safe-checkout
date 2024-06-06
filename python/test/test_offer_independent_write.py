# coding: utf-8

"""
    Safe Checkout

    Simple, yet elegant web interfaces for your convenience. One request away from your first secured C2C transaction.

    The version of the OpenAPI document: 2.0.11
    Contact: noc@tripartie.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from tpdk_safe_checkout.models.offer_independent_write import OfferIndependentWrite

class TestOfferIndependentWrite(unittest.TestCase):
    """OfferIndependentWrite unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> OfferIndependentWrite:
        """Test OfferIndependentWrite
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `OfferIndependentWrite`
        """
        model = OfferIndependentWrite()
        if include_optional:
            return OfferIndependentWrite(
                public_url = 'https://marketplace.tld/offers/that-special-item-i-wish-to-sold',
                redirect_url = 'https://marketplace.tld/offers/that-special-item-i-wish-to-sold?checkout=true',
                seller = tpdk_safe_checkout.models.offer_persona_independent_write.Offer-Persona-IndependentWrite(
                    first_name = 'John', 
                    last_name = 'Doe', 
                    gender = 'RATHER_NOT_SAY', 
                    date_of_birth = datetime.datetime.strptime('1975-12-30', '%Y-%m-%d').date(), 
                    language = 'fr', 
                    email = 'john.doe@gmail.com', 
                    mobile_phone_number = '+33745214529', 
                    address = tpdk_safe_checkout.models.offer_address_independent_write.Offer-Address-IndependentWrite(
                        company_name = 'Company Tld', 
                        country_code = 'FRA', 
                        zip_code = '75004', 
                        city_name = 'Paris', 
                        first_line = '118 avenue des champs élysées', 
                        second_line = 'Apt 6E', 
                        building_name = 'Electron', 
                        building_floor = 'Third floor', 
                        gate_or_portal_or_inbox_code = '3124', ), 
                    metadata = [
                        tpdk_safe_checkout.models.offer_metadata_independent_write.Offer-Metadata-IndependentWrite(
                            key = 'External-ID', 
                            value = '54412', )
                        ], ),
                preset_buyer = tpdk_safe_checkout.models.offer_persona_independent_write.Offer-Persona-IndependentWrite(
                    first_name = 'John', 
                    last_name = 'Doe', 
                    gender = 'RATHER_NOT_SAY', 
                    date_of_birth = datetime.datetime.strptime('1975-12-30', '%Y-%m-%d').date(), 
                    language = 'fr', 
                    email = 'john.doe@gmail.com', 
                    mobile_phone_number = '+33745214529', 
                    address = tpdk_safe_checkout.models.offer_address_independent_write.Offer-Address-IndependentWrite(
                        company_name = 'Company Tld', 
                        country_code = 'FRA', 
                        zip_code = '75004', 
                        city_name = 'Paris', 
                        first_line = '118 avenue des champs élysées', 
                        second_line = 'Apt 6E', 
                        building_name = 'Electron', 
                        building_floor = 'Third floor', 
                        gate_or_portal_or_inbox_code = '3124', ), 
                    metadata = [
                        tpdk_safe_checkout.models.offer_metadata_independent_write.Offer-Metadata-IndependentWrite(
                            key = 'External-ID', 
                            value = '54412', )
                        ], ),
                nature = 'physical_item',
                title = 'ASUS TUF X570-PLUS GAMING Motherboard',
                description = 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.',
                unit_price = 1.337,
                currency_code = 'EUR',
                item_count = 1,
                condition = 'USED',
                weight_in_gram = 56,
                shipping_allowed = True,
                hand_delivery_allowed = True,
                shipping_carriers = [
                    'SwissPost'
                    ],
                ean_code = '4718017388450',
                can_be_sold_separately = True,
                metadata = [
                    tpdk_safe_checkout.models.offer_metadata_independent_write.Offer-Metadata-IndependentWrite(
                        key = 'External-ID', 
                        value = '54412', )
                    ]
            )
        else:
            return OfferIndependentWrite(
                seller = tpdk_safe_checkout.models.offer_persona_independent_write.Offer-Persona-IndependentWrite(
                    first_name = 'John', 
                    last_name = 'Doe', 
                    gender = 'RATHER_NOT_SAY', 
                    date_of_birth = datetime.datetime.strptime('1975-12-30', '%Y-%m-%d').date(), 
                    language = 'fr', 
                    email = 'john.doe@gmail.com', 
                    mobile_phone_number = '+33745214529', 
                    address = tpdk_safe_checkout.models.offer_address_independent_write.Offer-Address-IndependentWrite(
                        company_name = 'Company Tld', 
                        country_code = 'FRA', 
                        zip_code = '75004', 
                        city_name = 'Paris', 
                        first_line = '118 avenue des champs élysées', 
                        second_line = 'Apt 6E', 
                        building_name = 'Electron', 
                        building_floor = 'Third floor', 
                        gate_or_portal_or_inbox_code = '3124', ), 
                    metadata = [
                        tpdk_safe_checkout.models.offer_metadata_independent_write.Offer-Metadata-IndependentWrite(
                            key = 'External-ID', 
                            value = '54412', )
                        ], ),
        )
        """

    def testOfferIndependentWrite(self):
        """Test OfferIndependentWrite"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
