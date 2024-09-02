# coding: utf-8

"""
    Safe Checkout

    Simple, yet elegant web interfaces for your convenience. One request away from your first secured C2C transaction.

    The version of the OpenAPI document: 2.0.33
    Contact: noc@tripartie.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from tpdk_safe_checkout.models.webhook import Webhook

class TestWebhook(unittest.TestCase):
    """Webhook unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Webhook:
        """Test Webhook
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Webhook`
        """
        model = Webhook()
        if include_optional:
            return Webhook(
                id = 122541,
                event = 'offer.closed',
                object_id = '01ARZ3NDEKTSV4RRFFQ69G5FAV',
                iri = '',
                occurred_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                object = None
            )
        else:
            return Webhook(
        )
        """

    def testWebhook(self):
        """Test Webhook"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
