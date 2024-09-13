# coding: utf-8

"""
    Safe Checkout

    Simple, yet elegant web interfaces for your convenience. One request away from your first secured C2C transaction.

    The version of the OpenAPI document: 2.0.69
    Contact: noc@tripartie.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from tpdk_safe_checkout.models.statistic_read_data_inner import StatisticReadDataInner

class TestStatisticReadDataInner(unittest.TestCase):
    """StatisticReadDataInner unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> StatisticReadDataInner:
        """Test StatisticReadDataInner
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `StatisticReadDataInner`
        """
        model = StatisticReadDataInner()
        if include_optional:
            return StatisticReadDataInner(
                request = 'OFFER_PUBLISHED_AMOUNT',
                start_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                end_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                value = 2554,
                values = [
                    tpdk_safe_checkout.models.statistic_output_array_single_value.Statistic-OutputArraySingleValue(
                        start_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                        end_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                        value = 28333, )
                    ]
            )
        else:
            return StatisticReadDataInner(
                request = 'OFFER_PUBLISHED_AMOUNT',
                start_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                end_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                value = 2554,
                values = [
                    tpdk_safe_checkout.models.statistic_output_array_single_value.Statistic-OutputArraySingleValue(
                        start_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                        end_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                        value = 28333, )
                    ],
        )
        """

    def testStatisticReadDataInner(self):
        """Test StatisticReadDataInner"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()